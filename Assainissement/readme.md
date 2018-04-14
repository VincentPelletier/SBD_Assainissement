Readme.md

Pour commencer, t�l�chargez postgresql via votre navigateur.
Ensuite, cr�ez un serveur accessible avec mot de passe, le mot de passe vous sera demand� lors de l'acc�s JDBC.
Cr�ez une base contenant le fichier adult.txt joint � ce projet via les m�thodes suivantes:

� Placez le fichier adult.txt dans ce r�pertoire: C:\Program Files (x86)\PostgreSQL\10\data\adult.txt 
� Acc�dez � votre server Postgresql r�cemment cr��
� Cr�ez une database
� Effectuez ces requ�tes:

	create table adult(
		age int,
		workclass varchar,
		fnlwgt int,
		education varchar,
		educationNum int,
		maritalStatus varchar,
		occupation varchar,
		relationship varchar,
		race varchar,
		sex varchar,
		capitalGain int,
		capitalLoss int,
		hoursPerWeek int,
		nativeCountry varchar,
		annualSalary varchar);

COPY adult FROM 'C:\Program Files (x86)\PostgreSQL\10\data\adult.txt' DELIMITER ',';

� Maintenant que vos donn�es sont install�es,ouvrez le java projet sur eclipse.
� T�l�chargez un driver JDBC via votre navigateur sur ce site: https://jdbc.postgresql.org/download.html.
� Effectuez un clic droit sur votre java project -> Build path -> add Externals Jars et ajoutez le driver t�l�charg�.
� Effectuez votre connexion JDBC en cliquant sur run sur le fichier Connexion.java et suivez les instructions, et attention a bien point� sur le bon port de votre database.

La connexion est maintenant pr�te, 


� 