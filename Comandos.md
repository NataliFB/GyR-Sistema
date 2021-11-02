# Comandos Git
1. git version
- Para poder ver que versión tenemos

2. git config --global user.name "nombre"
- Creación de nombre de usuario

3. git config --global user.email email@dominio.com
- Creación de email para el user

4. git init
- Inicializa el repositorio local

5. git add nombre-de-archivo
- El archivo es seguido y se agrega al staging

6. git commit -m "Mensaje que defina los cambios hechos"
- Se hace el commit para ser añadido al repositorio

7. git status (se le puede añadir -s para ver menos detallado el estado)
- Se hace para ver el estado del proyecto

8. git log (se le puede añadir --oneline para ver menos detallado el estado)
- Se hace para ver los commit del proyecto. Se ve el código, la rama y el commit

9. git checkout código-de-commit
- Se devuelve a un commit sin eliminar los demás commits

10. git show
- Para ver historial del proyecto

11. git reset código-de-commit --hard o --soft
- Se usa para volver a un commit eliminando los que tenga por delante. El soft conserva lo que haya en el staging

12. git brach
- Muestra las ramas

13. git brach nombre-de-rama
- Crea una nueva rama con el nombre especificado

14. git checkout nombre-de-rama
- Se mueve a la rama especificada

15. git merge nombre-de-rama
- Se fusionan la rama master a la rama especificada

16. git remote add nombre-del-remote url
- Se conecta con un repositorio en github

17. git remote -v
- Se ven los repositorios remotos conectados

18. git clone 
- Copia el repositorio remoto a la computadora

19. git push nombre-del-remote nombre-de-la-rama
- Envia el repositorio local al remoto

20. git pull nombre-del-remote nombre-de-la-rama
- Trae los ultimos commit a la computadora

21. git push origin :nombre-de-la-rama
- Elimina una rama en el repositorio remoto