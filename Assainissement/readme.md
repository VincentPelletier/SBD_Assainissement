Readme.md

Pour commencer, téléchargez postgresql via votre navigateur.
Ensuite, créez un serveur accessible avec mot de passe, le mot de passe vous sera demandé lors de l'accès JDBC.
Créez une base contenant le fichier adult.txt joint à ce projet via les méthodes suivantes:

• Placez le fichier adult.txt dans ce répertoire: C:\Program Files (x86)\PostgreSQL\10\data\adult.txt 
• Accédez à votre server Postgresql récemment créé
• Créez une database
• Effectuez ces requêtes:

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

• Maintenant que vos données sont installées,ouvrez le java projet sur eclipse.
• Téléchargez un driver JDBC via votre navigateur sur ce site: https://jdbc.postgresql.org/download.html.
• Effectuez un clic droit sur votre java project -> Build path -> add Externals Jars et ajoutez le driver téléchargé.
• Effectuez votre connexion JDBC en cliquant sur run sur le fichier Connexion.java et suivez les instructions, et attention a bien pointé sur le bon port de votre database.

La connexion est maintenant prête, 


• 