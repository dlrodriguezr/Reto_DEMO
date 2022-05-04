#RETO y cargado en Github
#03/05/2022
#DAYANNA RODRIGUEZ
	# esta automatización corresponde a los procesos de login, busqueda de ordenes generadas y por ultimo
	# comprobar que no se cuentaan con los permisos necesarios para editar un producto
Feature: RETO opencart


	@login
    Scenario: Login
	Given Open browser
	When login

	@Serch
	Scenario: Serch_Order
		Given Open browser
		When login
		Then Serch_Order

	@Edit
	Scenario: Edit_Product
		Given Open browser
		When login
		Then Edit_Product



















