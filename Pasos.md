# Pasos para subir archivos y bajarlos del repositorio

1. Modificación del proyecto
Se avanza en el proyecto, netbeans informa de las modificaciones, de lo añadido o eliminado

2. Añadir cambios
Despues de hacer cambios se añadin al área temporal o al staging con un git add . 

3. Commit
Se hace un commit para añadirlo al repositorio local con git commit, esto abre el editor vim de unix,
para evitar ese editor se usa git commit -m "Con un mensaje"

4. Subir al repositorio remoto
Para subir el repositorio local al remoto se usa git push origin "rama que se quiera subir"

5. GitHub
Desde GitHub personal se puede ver el ultimo cambio, GitHub informa de que tan actualizada está la rama seleccionada
con la rama del repositorio de la organización