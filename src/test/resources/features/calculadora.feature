#language: es

Característica: Calculadora
  Yo, como usuario
  Quiero, tener la opcion de usar la calculadora
  Para ver todos los resultados

  @test
  Escenario: Suman de dos numeros
    Dado que me encuentro en la página de la calculadora
    Cuando ingreso los datos firts number: "numero1" y second number: "numero2"
    Entonces valido que debería aparecer el resultado de la suma "numero1+numero2"

  @test
  Escenario: Resta de dos numeros
    Dado que me encuentro en la página de la calculadora
    Cuando ingreso los datos firts number: "numero1" y second number: "numero2"
    Entonces valido que debería aparecer el resultado de la resta "numero1-numero2"

  @test
  Escenario: Multiplicacion de dos numeros
    Dado que me encuentro en la página de la calculadora
    Cuando ingreso los datos firts number: "numero1" y second number: "numero2"
    Entonces valido que debería aparecer el resultado de la multiplicacion "numero1*numero2"

  @test
  Escenario: division de dos numeros
    Dado que me encuentro en la página de la calculadora
    Cuando ingreso los datos firts number: "numero1" y second number: "numero2"
    Entonces valido que debería aparecer el resultado de la division "numero1/numero2"

  @test
  Escenario: Concatenar dos numeros
    Dado que me encuentro en la página de la calculadora
    Cuando ingreso los datos firts number: "numero1" y second number: "numero2"
    Entonces valido que debería aparecer el resultado de la concatenacion "numero1numero2"


