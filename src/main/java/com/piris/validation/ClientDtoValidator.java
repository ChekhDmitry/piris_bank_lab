package com.piris.validation;

import com.piris.dto.ClientDto;
import com.piris.service.dao.*;
import com.piris.validation.message.ErrorMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class ClientDtoValidator implements Validator {

    @Autowired
    private ClientEntityService clientEntityService;
    
    //todo add existence validation for city, nationality, disability, maritalStatus

    @Override
    public boolean supports(Class<?> aClass) {
        return ClientDto.class.equals(aClass);
    }

    @Override
    public void validate(Object object, Errors errors) {

        final String FIELD_SURNAME = "surname";
        final String FIELD_NAME = "name";
        final String FIELD_FATHER_NAME = "fathersName";
        final String FIELD_BIRTHDAY = "birthday";
        final String FIELD_SEX = "sex";
        final String FIELD_PASSPORT_SERIES = "passportSeries";
        final String FIELD_PASSPORT_NUMBER = "passportNumber";
        final String FIELD_PASSPORT_ID = "passportId";
        final String FIELD_PASSPORT_PLACE = "passportPlace";
        final String FIELD_BIRTH_PLACE = "birthPlace";
        final String FIELD_CITY_ID  = "cityId";
        final String FIELD_ADDRESS = "address";
        final String FIELD_MOBILE_NUMBER = "mobileNumber";
        final String FIELD_HOME_MOBILE_NUMBER = "homeMobileNumber";
        final String FIELD_EMAIL = "email";
        final String FIELD_MARITAL_STATUS_ID = "maritalStatusId";
        final String FIELD_NATIONALITY_ID = "nationalityId";
        final String FIELD_DISABILITY_ID = "disabilityId";
        final String FIELD_PENSIONARY = "pensionary";
        final String FIELD_MONTHLY_INCOME = "monthlyIncome";
        final String FIELD_MILITARY = "military";

        ClientDto clientDto = (ClientDto) object;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, FIELD_NAME, ErrorMessage.EMPTYFIELD.getMessage());
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, FIELD_SURNAME, ErrorMessage.EMPTYFIELD.getMessage());
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, FIELD_FATHER_NAME, ErrorMessage.EMPTYFIELD.getMessage());
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, FIELD_ADDRESS, ErrorMessage.EMPTYFIELD.getMessage());
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, FIELD_BIRTH_PLACE, ErrorMessage.EMPTYFIELD.getMessage());
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, FIELD_BIRTHDAY, ErrorMessage.EMPTYFIELD.getMessage());
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, FIELD_DISABILITY_ID, ErrorMessage.EMPTYFIELD.getMessage());
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, FIELD_MARITAL_STATUS_ID, ErrorMessage.EMPTYFIELD.getMessage());
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, FIELD_MILITARY, ErrorMessage.EMPTYFIELD.getMessage());
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, FIELD_NATIONALITY_ID, ErrorMessage.EMPTYFIELD.getMessage());
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, FIELD_PASSPORT_ID, ErrorMessage.EMPTYFIELD.getMessage());
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, FIELD_PASSPORT_NUMBER, ErrorMessage.EMPTYFIELD.getMessage());
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, FIELD_PASSPORT_PLACE, ErrorMessage.EMPTYFIELD.getMessage());
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, FIELD_PASSPORT_SERIES, ErrorMessage.EMPTYFIELD.getMessage());
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, FIELD_PENSIONARY, ErrorMessage.EMPTYFIELD.getMessage());
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, FIELD_SEX, ErrorMessage.EMPTYFIELD.getMessage());
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, FIELD_CITY_ID, ErrorMessage.EMPTYFIELD.getMessage());

        if(clientEntityService.findBySurnameAndNameAndFathersName(clientDto.getSurname(), clientDto.getName(), clientDto.getFathersName()) != null){
            errors.rejectValue(FIELD_SURNAME, ErrorMessage.USEREXIST.getMessage());
            errors.rejectValue(FIELD_NAME, ErrorMessage.USEREXIST.getMessage());
            errors.rejectValue(FIELD_FATHER_NAME, ErrorMessage.USEREXIST.getMessage());
        }

        if(clientEntityService.findByPassportSeriesAndPassportNumber(clientDto.getPassportSeries(), clientDto.getPassportNumber()) != null){
            errors.rejectValue(FIELD_PASSPORT_SERIES, ErrorMessage.USEREXIST.getMessage());
            errors.rejectValue(FIELD_PASSPORT_NUMBER, ErrorMessage.USEREXIST.getMessage());
        }

        if(clientEntityService.findByPassportId(clientDto.getPassportId()) != null){
            errors.rejectValue(FIELD_PASSPORT_ID, ErrorMessage.USEREXIST.getMessage());
        }
    }
}
