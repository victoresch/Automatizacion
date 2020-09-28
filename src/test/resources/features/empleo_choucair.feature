
Feature:   Postularse a un empleo
  Un usuario web cualquiera
  Buscar a un empleo 
	Postularse a un empleo
	
  Scenario: postularse a un empleo 
    Given dado que victor quiere encontrar un trabajo
    When se postula diligenciando el formulario
    Then valida el registro con una confirmacion en pantalla