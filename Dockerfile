# Utilisez une image Java officielle en tant que base
FROM openjdk:17

# Copiez le fichier JAR dans le conteneur
COPY ./target /app

# Définissez le répertoire de travail
WORKDIR /app

# Commande pour exécuter l'application lorsque le conteneur démarre
CMD ["java", "-jar", "demo.jar"]