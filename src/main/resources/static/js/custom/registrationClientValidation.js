$(document).ready(function () {

    $('#client_form').validate({
        rules: {
            name_c: {
                required: true,
                minlength: 2,
                maxlength: 15,
                ruslettersonly: true
            },
            surname_c: {
                required: true,
                minlength: 2,
                maxlength: 20,
                ruslettersonly: true
            },
            father_name_c: {
                required: true,
                minlength: 2,
                maxlength: 20,
                ruslettersonly: true
            },
            passport_series_c: {
                required: true,
                minlength: 2,
                maxlength: 2,
                lettersonly: true
            },
            passport_number_c: {
                required: true,
                minlength: 7,
                maxlength: 7,
                digits: true
            },
            passport_id_c: {
                required: true,
                minlength: 7,
                maxlength: 7
            },
            passport_place_c: {
                required: true,
                minlength: 5,
                maxlength: 20
            },
            birth_place_c: {
                required: true,
                minlength: 5,
                maxlength: 20
            },
            city_c: {
                required: true
            },
            address_c: {
                required: true,
                minlength: 5,
                maxlength: 20
            },
            mobile_phone_c: {
                required: true,
                minlength: 7,
                maxlength: 11,
                digits: true
            },
            home_phone_c: {
                required: true,
                minlength: 7,
                maxlength: 11,
                digits: true
            },
            email_c: {
                required: true,
                maxlength: 40,
                email: true
            },
            marital_status_c: {
                required: true
            },
            nationality_c: {
                required: true
            },
            disability_c: {
                required: true
            },
            monthly_income_c: {
                required: true,
                minlength: 1,
                maxlength: 6,
                number: true,
                min: 1,
                max: 100000
            }
        },

        messages: {
            name_c: {
                required: "<span class='glyphicon glyphicon-exclamation-sign'></span> Обязательное поле.",
                minlength: "<span class='glyphicon glyphicon-exclamation-sign'></span> Мин. длина: 2.",
                maxlength: "<span class='glyphicon glyphicon-exclamation-sign'></span> Мaкс. длина. длина: 15.",
                ruslettersonly: "<span class='glyphicon glyphicon-exclamation-sign'></span> Только русские буквы."
            },
            surname_c: {
                required: "<span class='glyphicon glyphicon-exclamation-sign'></span> Обязательное поле.",
                minlength: "<span class='glyphicon glyphicon-exclamation-sign'></span> Мин. длина: 2.",
                maxlength: "<span class='glyphicon glyphicon-exclamation-sign'></span> Мaкс. длина. длина: 20.",
                ruslettersonly: "<span class='glyphicon glyphicon-exclamation-sign'></span> Только русские буквы."
            },
            father_name_c: {
                required: "<span class='glyphicon glyphicon-exclamation-sign'></span> Обязательное поле.",
                minlength: "<span class='glyphicon glyphicon-exclamation-sign'></span> Мин. длина: 2.",
                maxlength: "<span class='glyphicon glyphicon-exclamation-sign'></span> Мaкс. длина. длина: 20.",
                ruslettersonly: "<span class='glyphicon glyphicon-exclamation-sign'></span> Только русские буквы."
            },
            passport_series_c: {
                required: "<span class='glyphicon glyphicon-exclamation-sign'></span> Обязательное поле.",
                minlength: "<span class='glyphicon glyphicon-exclamation-sign'></span> Мин. длина: 2.",
                maxlength: "<span class='glyphicon glyphicon-exclamation-sign'></span> Мaкс. длина. длина: 2.",
                lettersonly: "<span class='glyphicon glyphicon-exclamation-sign'></span> Только буквы."
            },
            passport_number_c: {
                required: "<span class='glyphicon glyphicon-exclamation-sign'></span> Обязательное поле.",
                minlength: "<span class='glyphicon glyphicon-exclamation-sign'></span> Мин. длина: 7.",
                maxlength: "<span class='glyphicon glyphicon-exclamation-sign'></span> Мaкс. длина. длина: 7.",
                digits: "<span class='glyphicon glyphicon-exclamation-sign'></span> Только цифры."
            },
            passport_id_c: {
                required: "<span class='glyphicon glyphicon-exclamation-sign'></span> Обязательное поле.",
                minlength: "<span class='glyphicon glyphicon-exclamation-sign'></span> Мин. длина: 7.",
                maxlength: "<span class='glyphicon glyphicon-exclamation-sign'></span> Мaкс. длина. длина: 7.",
            },
            passport_place_c: {
                required: "<span class='glyphicon glyphicon-exclamation-sign'></span> Обязательное поле.",
                minlength: "<span class='glyphicon glyphicon-exclamation-sign'></span> Мин. длина: 5.",
                maxlength: "<span class='glyphicon glyphicon-exclamation-sign'></span> Мaкс. длина. длина: 20.",
            },
            birth_place_c: {
                required: "<span class='glyphicon glyphicon-exclamation-sign'></span> Обязательное поле.",
                minlength: "<span class='glyphicon glyphicon-exclamation-sign'></span> Мин. длина: 5.",
                maxlength: "<span class='glyphicon glyphicon-exclamation-sign'></span> Мaкс. длина. длина: 20.",
            },
            city_name_c: {
                required: "<span class='glyphicon glyphicon-exclamation-sign'></span> Обязательное поле."
            },
            address_c: {
                required: "<span class='glyphicon glyphicon-exclamation-sign'></span> Обязательное поле.",
                minlength: "<span class='glyphicon glyphicon-exclamation-sign'></span> Мин. длина: 5.",
                maxlength: "<span class='glyphicon glyphicon-exclamation-sign'></span> Мaкс. длина. длина: 20.",
            },
            mobile_phone_c: {
                required: "<span class='glyphicon glyphicon-exclamation-sign'></span> Обязательное поле.",
                minlength: "<span class='glyphicon glyphicon-exclamation-sign'></span> Мин. длина: 7.",
                maxlength: "<span class='glyphicon glyphicon-exclamation-sign'></span> Мaкс. длина. длина: 11.",
                digits: "<span class='glyphicon glyphicon-exclamation-sign'></span> Только цифры."
            },
            home_phone_c: {
                required: "<span class='glyphicon glyphicon-exclamation-sign'></span> Обязательное поле.",
                minlength: "<span class='glyphicon glyphicon-exclamation-sign'></span> Мин. длина: 7.",
                maxlength: "<span class='glyphicon glyphicon-exclamation-sign'></span> Мaкс. длина. длина: 11.",
                digits: "<span class='glyphicon glyphicon-exclamation-sign'></span> Только цифры."
            },
            email_c: {
                required: "<span class='glyphicon glyphicon-exclamation-sign'></span> Обязательное поле.",
                maxlength: "<span class='glyphicon glyphicon-exclamation-sign'></span> Мaкс. длина. длина: 40.",
                email: "<span class='glyphicon glyphicon-exclamation-sign'></span> Неправильный email."
            },
            marital_status_c: {
                required: "<span class='glyphicon glyphicon-exclamation-sign'></span> Обязательное поле."
            },
            nationality_c: {
                required: "<span class='glyphicon glyphicon-exclamation-sign'></span> Обязательное поле."
            },
            disability_c: {
                required: "<span class='glyphicon glyphicon-exclamation-sign'></span> Обязательное поле."
            },
            monthly_income_c: {
                required: "<span class='glyphicon glyphicon-exclamation-sign'></span> Обязательное поле.",
                minlength: "<span class='glyphicon glyphicon-exclamation-sign'></span> Мин. длина: 1.",
                maxlength: "<span class='glyphicon glyphicon-exclamation-sign'></span> Мaкс. длина. длина: 6.",
                number: "<span class='glyphicon glyphicon-exclamation-sign'></span> Только число.",
                min: "<span class='glyphicon glyphicon-exclamation-sign'></span> Должно быть больше 1.",
                max: "<span class='glyphicon glyphicon-exclamation-sign'></span> Должно быть меньше 100000."
            }
        }
    });

    $('#client_form input').on('keyup blur', function () {
        validateStudentForm();
    });

    $('#city_name_client').on('change', function () {
        validateStudentForm();
    });

    $('#nationality_client').on('change', function () {
        validateStudentForm();
    });

    $('#disability_client').on('change', function () {
        validateStudentForm();
    });

    $('#marital_status_client').on('change', function () {
        validateStudentForm();
    });

});

function validateStudentForm(){
    if ($('#client_form').valid()) {
        $('#submit_student_btn').prop('disabled', false);
    } else {
        $('#submit_student_btn').prop('disabled', 'disabled');
    }
}