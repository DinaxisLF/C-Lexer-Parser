# Compilar el proyecto
```
mvn clean package
```

# Correr dentro de la carpeta C-LEXER-PARSER
```
docker build -t compilador .
```

# Para correr el docker con las entradas de input:
```
docker run -it --rm compilador
```