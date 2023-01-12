Feature: Funcionalidad generar registro solicitud de atencion
  Rule: Yo como usuario ingreso a la web de la clinica y proceso a generar una solicitud de atencion

    Background: Ingresar a la web
      Given que el usuario ingresa a la web cura healtcare

    @regresion-success
    Scenario Outline: Validar registro de solicitud de atencion
      When ingreso mi usuario<user> y contrasena<pass>en login
      And ingreso datos de registro facilidad programa<healthp> fecha<date> comentario<coment>
      Then validar datos ingresados facilidad programa<healthp> fecha<date> comentario<coment>
      Examples:
        | user     | pass               |  healthp  | date     | coment             |
        | John Doe | ThisIsNotAPassword |  Medicaid | 20/01/2023 | confirmar registro |

