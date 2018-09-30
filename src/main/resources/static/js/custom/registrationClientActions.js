let elements = {};

$(document).ready(function () {

    elements ={
        clientNameInputField : $('#name_client'),
        clientSurnameInputField : $('#surname_client'),

        clientFatherNameInputField : $('#father_name_client'),
        birthDateClientInputFiled: $('#birth_date_client'),
        clientSexRadioBtnField : $('#sex_radio_Form'),
        passportSeriesClientInputFiled : $('#passport_series_client'),
        passportNumberClientInputFiled : $('#passport_number_client'),
        passportIdClientInputFiled : $('#passport_id_client'),
        passportPlaceClientInputFiled : $('#passport_place_client'),
        birthPlaceClientInputFiled : $('#birth_place_client'),

        cityNameSelectionField : $('#city_name_client'),

        addressInputField : $('#address_client'),
        clientMobilePhoneInputField : $('#mobile_phone_client'),
        clientHomePhoneInputField : $('#home_phone_client'),
        clientEmailInputField : $('#email_client'),

        maritalStatusSelectionField : $('#marital_status_client'),
        nationalitySelectionField : $('#nationality_client'),
        disabilitySelectionField : $('#disability_client'),

        clientPensionaryRadioBtnField : $('#pensionary_radio_Form'),

        clientMonthlyIncomeInputField : $('#monthly_income_client'),

        clientMilitaryRadioBtnField : $('#military_radio_Form'),

        studentSubmitBtn : $('#submit_student_btn'),

        alertModal: $('#alert_modal'),
        alertText: $('#alert_text'),
        alertCloseBtn: $('#alert_close_btn')
    };

    getCities();
    getNationalities();
    getMaritalStatuses();
    getDisabilities();

    elements.studentSubmitBtn.click(function(){
        registrationClientAjaxRequest()
    });

    elements.alertCloseBtn.click(function () {
        window.location.replace("/registration");
    });

    elements.alertModal.on('hidden.bs.modal', function () {
        window.location.replace("/registration");
    })

});

function getCities() {
    $.ajax({
        url: '/city',
        type: 'GET',
        contentType: "application/json; charset=UTF-8",
        data: '',
        success: function (data) {
            for(let i in data) {
                elements.cityNameSelectionField.append($("<option></option>")
                    .attr("value", data[i].id)
                    .text(data[i].name));
            }
        }
    });
}

function getNationalities() {
    $.ajax({
        url: '/nationality',
        type: 'GET',
        contentType: "application/json; charset=UTF-8",
        data: '',
        success: function (data) {
            for(let i in data) {
                elements.nationalitySelectionField.append($("<option></option>")
                    .attr("value", data[i].id)
                    .text(data[i].name));
            }
        }
    });
}

function getMaritalStatuses() {
    $.ajax({
        url: '/marital',
        type: 'GET',
        contentType: "application/json; charset=UTF-8",
        data: '',
        success: function (data) {
            for(let i in data) {
                elements.maritalStatusSelectionField.append($("<option></option>")
                    .attr("value", data[i].id)
                    .text(data[i].name));
            }
        }
    });
}

function getDisabilities() {
    $.ajax({
        url: '/disability',
        type: 'GET',
        contentType: "application/json; charset=UTF-8",
        data: '',
        success: function (data) {
            for(let i in data) {
                elements.disabilitySelectionField.append($("<option></option>")
                    .attr("value", data[i].id)
                    .text(data[i].name));
            }
        }
    });
}

function registrationClientAjaxRequest() {
    $.ajax({
        type: "PUT",
        contentType: "application/json; charset=UTF-8",
        url:"/client",
        data:JSON.stringify({
            "name":elements.clientNameInputField.val(),
            "surname":elements.clientSurnameInputField.val(),
            "fathersName":elements.clientFatherNameInputField.val(),
            "birthday":elements.birthDateClientInputFiled.val(),
            "sex":elements.clientSexRadioBtnField.find("input[type='radio']:checked").val(),
            "passportSeries":elements.passportSeriesClientInputFiled.val(),
            "passportNumber":elements.passportNumberClientInputFiled.val(),
            "passportId":elements.passportIdClientInputFiled.val(),
            "passportPlace":elements.passportPlaceClientInputFiled.val(),
            "birthPlace":elements.birthPlaceClientInputFiled.val(),
            "cityId":elements.cityNameSelectionField.val(),
            "address":elements.addressInputField.val(),
            "mobileNumber":elements.clientMobilePhoneInputField.val(),
            "homeMobileNumber":elements.clientHomePhoneInputField.val(),
            "email":elements.clientEmailInputField.val(),
            "maritalStatusId":elements.maritalStatusSelectionField.val(),
            "nationalityId":elements.nationalitySelectionField.val(),
            "disabilityId":elements.disabilitySelectionField.val(),
            "pensionary":elements.clientPensionaryRadioBtnField.find("input[type='radio']:checked").val(),
            "monthlyIncome":elements.clientMonthlyIncomeInputField.val(),
            "military":elements.clientMilitaryRadioBtnField.find("input[type='radio']:checked").val()
            }),
        success: function (data) {

            //Backend validation error messages
            elements.clientNameInputField.parent().next(".text-danger").remove();
            if(data.name != null) {
                elements.clientNameInputField.parent().after("<p class='text-danger'><span class='glyphicon glyphicon-ban-circle'></span> " + data.name + "</p>");
            }

            elements.clientSurnameInputField.parent().next(".text-danger").remove();
            if(data.surname != null) {
                elements.clientSurnameInputField.parent().after("<p class='text-danger'><span class='glyphicon glyphicon-ban-circle'></span> " + data.surname + "</p>");
            }

            elements.clientFatherNameInputField.parent().next(".text-danger").remove();
            if(data.fathersName != null) {
                elements.clientFatherNameInputField.parent().after("<p class='text-danger'><span class='glyphicon glyphicon-ban-circle'></span> " + data.fathersName + "</p>");
            }

            elements.birthPlaceClientInputFiled.parent().next(".text-danger").remove();
            if(data.birthday != null) {
                elements.birthPlaceClientInputFiled.parent().after("<p class='text-danger'><span class='glyphicon glyphicon-ban-circle'></span> " + data.birthday + "</p>");
            }

            elements.clientSexRadioBtnField.parent().next(".text-danger").remove();
            if(data.sex != null) {
                elements.clientSexRadioBtnField.parent().after("<p class='text-danger'><span class='glyphicon glyphicon-ban-circle'></span> " + data.sex + "</p>");
            }

            elements.passportSeriesClientInputFiled.parent().next(".text-danger").remove();
            if(data.passportSeries != null) {
                elements.passportSeriesClientInputFiled.parent().after("<p class='text-danger'><span class='glyphicon glyphicon-ban-circle'></span> " + data.passportSeries + "</p>");
            }

            elements.passportNumberClientInputFiled.parent().next(".text-danger").remove();
            if(data.passportNumber != null) {
                elements.passportNumberClientInputFiled.parent().after("<p class='text-danger'><span class='glyphicon glyphicon-ban-circle'></span> " + data.passportNumber + "</p>");
            }

            elements.passportIdClientInputFiled.parent().next(".text-danger").remove();
            if(data.passportId != null) {
                elements.passportIdClientInputFiled.parent().after("<p class='text-danger'><span class='glyphicon glyphicon-ban-circle'></span> " + data.passportId + "</p>");
            }

            elements.passportPlaceClientInputFiled.parent().next(".text-danger").remove();
            if(data.passportPlace != null) {
                elements.passportPlaceClientInputFiled.parent().after("<p class='text-danger'><span class='glyphicon glyphicon-ban-circle'></span> " + data.passportPlace + "</p>");
            }

            elements.birthPlaceClientInputFiled.parent().next(".text-danger").remove();
            if(data.birthPlace != null) {
                elements.birthPlaceClientInputFiled.parent().after("<p class='text-danger'><span class='glyphicon glyphicon-ban-circle'></span> " + data.birthPlace + "</p>");
            }

            elements.cityNameSelectionField.parent().next(".text-danger").remove();
            if(data.cityId != null) {
                elements.cityNameSelectionField.parent().after("<p class='text-danger'><span class='glyphicon glyphicon-ban-circle'></span> " + data.cityId + "</p>");
            }

            elements.addressInputField.parent().next(".text-danger").remove();
            if(data.address != null) {
                elements.addressInputField.parent().after("<p class='text-danger'><span class='glyphicon glyphicon-ban-circle'></span> " + data.address + "</p>");
            }

            elements.clientMobilePhoneInputField.parent().next(".text-danger").remove();
            if(data.mobileNumber != null) {
                elements.clientMobilePhoneInputField.parent().after("<p class='text-danger'><span class='glyphicon glyphicon-ban-circle'></span> " + data.mobileNumber + "</p>");
            }

            elements.clientHomePhoneInputField.parent().next(".text-danger").remove();
            if(data.homeMobileNumber != null) {
                elements.clientHomePhoneInputField.parent().after("<p class='text-danger'><span class='glyphicon glyphicon-ban-circle'></span> " + data.homeMobileNumber + "</p>");
            }

            elements.clientEmailInputField.parent().next(".text-danger").remove();
            if(data.email != null) {
                elements.clientEmailInputField.parent().after("<p class='text-danger'><span class='glyphicon glyphicon-ban-circle'></span> " + data.email + "</p>");
            }

            elements.maritalStatusSelectionField.parent().next(".text-danger").remove();
            if(data.maritalStatusId != null) {
                elements.maritalStatusSelectionField.parent().after("<p class='text-danger'><span class='glyphicon glyphicon-ban-circle'></span> " + data.maritalStatusId + "</p>");
            }

            elements.nationalitySelectionField.parent().next(".text-danger").remove();
            if(data.nationalityId != null) {
                elements.nationalitySelectionField.parent().after("<p class='text-danger'><span class='glyphicon glyphicon-ban-circle'></span> " + data.nationalityId + "</p>");
            }

            elements.disabilitySelectionField.parent().next(".text-danger").remove();
            if(data.disabilityId != null) {
                elements.disabilitySelectionField.parent().after("<p class='text-danger'><span class='glyphicon glyphicon-ban-circle'></span> " + data.disabilityId + "</p>");
            }

            elements.clientPensionaryRadioBtnField.parent().next(".text-danger").remove();
            if(data.pensionary != null) {
                elements.clientPensionaryRadioBtnField.parent().after("<p class='text-danger'><span class='glyphicon glyphicon-ban-circle'></span> " + data.pensionary + "</p>");
            }

            elements.clientMonthlyIncomeInputField.parent().next(".text-danger").remove();
            if(data.monthlyIncome != null) {
                elements.clientMonthlyIncomeInputField.parent().after("<p class='text-danger'><span class='glyphicon glyphicon-ban-circle'></span> " + data.monthlyIncome + "</p>");
            }

            elements.clientMilitaryRadioBtnField.parent().next(".text-danger").remove();
            if(data.military != null) {
                elements.clientMilitaryRadioBtnField.parent().after("<p class='text-danger'><span class='glyphicon glyphicon-ban-circle'></span> " + data.military + "</p>");
            }

            if(!data){
                elements.alertText.html("Client");
                elements.alertModal.modal("show");
            }

        }
    })
}





