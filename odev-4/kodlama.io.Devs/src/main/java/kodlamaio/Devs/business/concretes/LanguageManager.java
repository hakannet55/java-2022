package kodlamaio.Devs.business.concretes;

import kodlamaio.Devs.business.abstracts.LanguageService;
import kodlamaio.Devs.business.requests.AddSubTechnologyRequest;
import kodlamaio.Devs.business.requests.LanguageAddRequest;
import kodlamaio.Devs.business.responses.LanguageResponse;
import kodlamaio.Devs.dataAccess.abstracts.LanguageRepository;
import kodlamaio.Devs.dataAccess.abstracts.SubTechnologyLanguageRelationRepository;
import kodlamaio.Devs.dataAccess.abstracts.SubTechnologyRepository;
import kodlamaio.Devs.entities.conceretes.Language;
import kodlamaio.Devs.entities.conceretes.SubTechnology;
import kodlamaio.Devs.entities.conceretes.SubTechnologyLanguageRelation;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service // Business nesnesidir
public class LanguageManager implements LanguageService {
    private final LanguageRepository languageRepository;
    private final SubTechnologyRepository subTechnologyRepository;
    private final SubTechnologyLanguageRelationRepository subTechnologyLanguageRelationRepository;

    public LanguageManager(SubTechnologyLanguageRelationRepository subTechnologyLanguageRelationRepository, LanguageRepository languageRepository, SubTechnologyRepository subTechnologyRepository) {
        this.languageRepository = languageRepository;
        this.subTechnologyRepository = subTechnologyRepository;
        this.subTechnologyLanguageRelationRepository = subTechnologyLanguageRelationRepository;
    }

    @Override
    public List<LanguageResponse> getAll() {
        // iş kuralları
        List<SubTechnologyLanguageRelation> subTechnologyLanguageRelationList = this.subTechnologyLanguageRelationRepository.findAll();
        List<SubTechnology> subTechnologiesList = this.subTechnologyRepository.findAll();
        List<Language> languages = this.languageRepository.findAll();
        List<LanguageResponse> languageResponses = new ArrayList();
        for (Language subLang : languages) {
            LanguageResponse languageResponse1 = new LanguageResponse();
            languageResponse1.setName(subLang.getName());
            // get relationList by LanguageId
            SubTechnologyLanguageRelation findSubTechnologyLanguageRelation = subTechnologyLanguageRelationList.stream().filter(i -> i.getLangId() == subLang.getId()).findAny().get();
            SubTechnology findSubTechnology = subTechnologiesList.stream().filter(i -> i.getId() == findSubTechnologyLanguageRelation.getLangId()).findAny().get();
            languageResponse1.setSubTechnology(findSubTechnology.getName());
            languageResponses.add(languageResponse1);
        }
        return languageResponses;
    }

    @Override
    public LanguageResponse getById(Integer id) {
        LanguageResponse languageResponse = new LanguageResponse();
        Language language = this.languageRepository.getReferenceById(id);
        languageResponse.setName(language.getName());
        languageResponse.setSubTechnology("");
        return languageResponse;
    }

    @Override
    public void add(LanguageAddRequest language) {
        Language language1 = new Language();
        language1.setName(language.getName());
        this.languageRepository.save(language1);
    }

    @Override
    public void update(Language language) {
        Language customerToUpdate = languageRepository.getReferenceById(language.getId());
        customerToUpdate.setName(language.getName());
        this.languageRepository.save(customerToUpdate);
    }

    @Override
    public void delete(Integer id) {
        this.languageRepository.deleteById(id);
        //return new GenericResponse(200);
    }

    @Override
    public void addSubTechnology(AddSubTechnologyRequest addSubTechnologyRequest) {
        // relation table
        Language language = this.languageRepository.getReferenceById(addSubTechnologyRequest.getLangId());
        SubTechnology subTechnology = this.subTechnologyRepository.getReferenceById(addSubTechnologyRequest.getTechId());
        if (subTechnology != null && language != null) {
            SubTechnologyLanguageRelation subTechnologyLanguageRelation = new SubTechnologyLanguageRelation();
            subTechnologyLanguageRelation.setLangId(language.getId());
            subTechnologyLanguageRelation.setTechId(subTechnology.getId());
            this.subTechnologyLanguageRelationRepository.save(subTechnologyLanguageRelation);
        }
    }

    @Override
    public void removeSubTechnology(Integer languageId, Integer techId) {

    }

    @Override
    public void getSubTechnology(Integer languageId) {

    }


}
