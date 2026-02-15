parte GIT

## Git

### 1. ¿Qué es un repositorio en Git y cómo se diferencia de un proyecto “normal”?
Un repositorio es un proyecto que incluye historial de versiones y metadatos gestionados por Git.  
Un proyecto “normal” solo contiene archivos sin control de cambios ni ramas.

---

### 2. ¿Cuáles son las tres áreas principales de Git?
- **Working Directory:** donde editas archivos.  
- **Staging Area (Index):** zona intermedia para preparar qué cambios entrarán en el próximo commit.  
- **Repository:** almacén interno con historial y objetos.

---

### 3. ¿Cómo representa Git los cambios internamente?
- **Blob:** contenido de archivos.  
- **Tree:** estructura de directorios.  
- **Commit:** snapshot con metadatos (autor, fecha, mensaje).  
- **Tag:** referencia legible a un commit específico.

---

### 4. ¿Cómo se crea un commit y qué información almacena un objeto commit?
Se hace con git commit -m "mensaje".  
Un commit almacena: snapshot de archivos, autor, fecha, mensaje y referencia al commit padre.

---

### 5. ¿Cuál es la diferencia entre git pull y git fetch?
- **git fetch:** descarga cambios remotos pero no los integra.  
- **git pull:** hace fetch + integra (merge o rebase).

---

### 6. ¿Qué es un branch (rama) en Git y cómo Git gestiona los punteros a commits?
Una rama es un puntero móvil a un commit.  
Git gestiona ramas como referencias que avanzan con cada commit.

---

### 7. ¿Cómo se realiza un merge y qué conflictos pueden surgir? ¿Cómo se resuelven?
- git merge combina ramas.  
- Conflictos surgen si dos ramas modifican la misma línea o archivo.  
- Se resuelven editando manualmente los archivos y confirmando con un commit.

---

### 8. ¿Cómo funciona el área de staging (git add) y qué pasa si omito este paso?
Es un borrador de lo que entrará en el commit.  
Si omites git add, los cambios no se registran en el commit.

---

### 9. ¿Qué es el archivo .gitignore y cómo influye en el seguimiento de archivos?
Lista de archivos que Git debe ignorar (ej. binarios, logs, dependencias).  
Evita que se suban archivos innecesarios.

---

### 10. ¿Cuál es la diferencia entre un “commit amend” (--amend) y un nuevo commit?
- git commit --amend: modifica el último commit (mensaje o contenido).  
- Nuevo commit: crea otra entrada en el historial.

---

### 11. ¿Cómo se utiliza git stash y en qué escenarios es útil?
Guarda temporalmente cambios sin hacer commit.  
Útil para cambiar de rama sin perder trabajo en progreso.

---

### 12. ¿Qué mecanismos ofrece Git para deshacer cambios?
- git reset`: mueve HEAD y puede borrar historial.  
- git revert`: crea un commit que deshace otro.  
- git checkout`: cambia de rama o restaura archivos.

---

### 13. ¿Cómo funciona la configuración de remotos (origin, upstream) y qué comandos uso para gestión de forks?
- **origin:** tu fork o repositorio principal.  
- **upstream:** el repositorio original del que hiciste fork.  
- Se gestionan con git remote add, git fetch, git pull.

---

### 14. ¿Cómo puedo inspeccionar el historial de commits?
- git log: lista commits.  
- git diff: muestra diferencias entre versiones.  
- git show: detalles de un commit específico.

---