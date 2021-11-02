# Pasos para subir archivos y bajarlos del repositorio

1. Modificación del proyecto <br>
Se avanza en el proyecto, netbeans informa de las modificaciones, de lo añadido o eliminado

2. Añadir cambios <br>
Despues de hacer cambios se añadin al área temporal o al staging con un git add . 

3. Commit <br>
Se hace un commit para añadirlo al repositorio local con git commit, esto abre el editor vim de unix,
para evitar ese editor se usa git commit -m "Con un mensaje"

4. Subir al repositorio remoto <br>
Para subir el repositorio local al remoto se usa git push origin "rama que se quiera subir"

5. GitHub <br>
Desde GitHub personal se puede ver el ultimo cambio, GitHub informa de que tan actualizada está la rama seleccionada
con la rama del repositorio de la organización. Si dice que "this branch is * commits behind" significa que no está actualizada
con la rama del repositorio de la organización. Si dice que "this branch is * commits ahead" significa que está por delante y se necesita
hacer un merge hacia esa rama, solo si se quiere actualizar el proyecto del repositorio de la organización

6. Añadir commits al proyecto original <br>
Se debe seleccionar la opción "contribute", ahí si hay commits cuales añadir mostrara una página comparando las diferencias
de las ramas, luego se selecciona pull request para hacer la solicitud. Luego de hacer la solicitud un propietario podrá admitir la unión
de las ramas, si se admite el proyecto se actualiza

7. Actualizar proyecti <br>
Si el proyecto está commits por debajo se debe de actualizar. Primero se crea una conexión con el repositorio principal
git remote add "nombre de la conexión" "URL del repositorio". Luego se puede comprobar las conexiones con git remote -v
Para traer los archivos que no tenemos en comparación del repositorio principal se tiene que hacer pull
git pull "conexión" "rama" y se actualizara la rama. Luego de eso se inicia el proceso de añadir, hacer commits y subir el repositorio

## Push y Pull

### Push

Se usa para subir cambios en el repositorio y en la rama especificada. Si se va a subir una rama de prueba para hacer pruebas, esto debe de ser especificado
Por ejemplo: git push origin pruebas. Esto especifica que va a subir al repositorio remoto llamado origin, la rama pruebas.
Esto no afectaría a la rama master.

### Pull
Se usa para traer los cambios de un repositorio y rama especifica. 
Por ejemplo: git pull origin pruebas. Esto traerá los cambios del remote origin y la rama pruebas.
Si se tiene otra rama llamada master en la cual hay diferentes cosas, estas no serán traidas.