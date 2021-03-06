package io.zensoft.share.service.model.impl;

import io.zensoft.share.model.PublisherServiceType;
import io.zensoft.share.model.Vacancy;
import io.zensoft.share.model.VacancyResponse;
import io.zensoft.share.repository.VacancyResponseRepository;
import io.zensoft.share.service.model.VacancyResponseModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by temirlan on 6/29/18.
 */
@Service
public class DefaultVacancyResponseModelService extends AbstractModelRepositoryServiceImpl<VacancyResponse, Long> implements VacancyResponseModelService {

    private VacancyResponseRepository vacancyResponseRepository;
    @Autowired
    public DefaultVacancyResponseModelService(JpaRepository<VacancyResponse, Long> repository,
                                              VacancyResponseRepository vacancyResponseRepository) {
        super(repository);
        this.vacancyResponseRepository = vacancyResponseRepository;
    }

    @Override
    public List<VacancyResponse> getAllByVacancy(Vacancy vacancy) {
        return ((VacancyResponseRepository) repository).getAllByVacancy(vacancy);
    }

    @Override
    public VacancyResponse getByVacancyAndPublisherServiceType(Vacancy vacancy, PublisherServiceType publisherServiceType) {
        return ((VacancyResponseRepository) repository).getByVacancyAndPublisherServiceType(vacancy, publisherServiceType);
    }

    @Override
    public VacancyResponse getByVacancyUuidAndPublisherServiceType(Vacancy vacancy,
                                                                    PublisherServiceType publisherServiceType) {
        if(vacancy.getUuid() == null || vacancy.getUuid().length() == 0){
            return null;
        }
        return vacancyResponseRepository.getByVacancyUuidAndPublisherServiceType(vacancy.getUuid(),publisherServiceType);
    }
}
