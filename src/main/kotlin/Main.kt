import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.time.TimeSource

suspend fun sincronizarEstudiantes() {
    println("Iniciando sincronización de estudiantes...")
    delay(3000)
    println("Sincronización de estudiantes finalizada.")
}

suspend fun consultarCursos() {
    println("Iniciando consulta de cursos...")
    delay(2000)
    println("Consulta de cursos finalizada.")
}

suspend fun descargarEvaluaciones() {
    println("Iniciando descarga de evaluaciones...")
    delay(4000)
    println("Descarga de evaluaciones finalizada.")
}

suspend fun actualizarAsistencia() {
    println("Iniciando actualización de asistencia...")
    delay(3000)
    println("Actualización de asistencia finalizada.")
}

fun main(): Unit = runBlocking {
    println("=== CHRONOS - DIAGNÓSTICO SECUENCIAL ===")
    val inicio = TimeSource.Monotonic.markNow()

    sincronizarEstudiantes()
    consultarCursos()
    descargarEvaluaciones()
    actualizarAsistencia()

    println("Todas las operaciones finalizadas.")
    println("Tiempo total: ${inicio.elapsedNow().inWholeMilliseconds} ms")
}
