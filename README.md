# CHRONOS — CHR-001

Proyecto Kotlin/JVM con Gradle para demostrar ejecución secuencial usando corrutinas y `runBlocking`.

## Requisitos
- JDK 21
- Gradle 8.14+ instalado (o ejecutar desde un IDE con Gradle configurado)

## Ejecutar

```bash
gradle run
```

Las operaciones se ejecutan secuencialmente con `delay`: 3000 + 2000 + 4000 + 3000 = aproximadamente **12 segundos**.
No se usan `launch`, `async`, `await` ni `Thread.sleep`.

## Entrega

```bash
git init
git add .
git commit -m "CHR-001: diagnóstico secuencial de CHRONOS"
git branch -M main
git remote add origin URL_DEL_REPOSITORIO
git push -u origin main
```

Si el repositorio ya está inicializado, omite `git init`, `git branch -M main` y `git remote add origin` y ejecuta solo add, commit y push en la rama correcta. Luego abre **Challenge** y comprueba la misión.
