
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.time.TimeSource

suspend fun esperarServicio(nombreServicio: String, tiempoMs: Long) {
    println("$nombreServicio esperando respuesta...")
    delay(tiempoMs)
    println("$nombreServicio respondió.")
}

suspend fun sincronizarEstudiantes() {
    println("Iniciando sincronización de estudiantes...")
    esperarServicio("Servicio de estudiantes", 3000L)
    println("Sincronización de estudiantes finalizada.")
}

suspend fun consultarCursos() {
    println("Iniciando consulta de cursos...")
    esperarServicio("Servicio de cursos", 2000L)
    println("Consulta de cursos finalizada.")
}

suspend fun descargarEvaluaciones() {
    println("Iniciando descarga de evaluaciones...")
    esperarServicio("Servicio de evaluaciones", 4000L)
    println("Descarga de evaluaciones finalizada.")
}

suspend fun actualizarAsistencia() {
    println("Iniciando actualización de asistencia...")
    esperarServicio("Servicio de asistencia", 3000L)
    println("Actualización de asistencia finalizada.")
}

fun main(): Unit = runBlocking {
    println("=== CHRONOS - CHR-002: LIBERAR EL HILO ===")

    val inicio = TimeSource.Monotonic.markNow()

    sincronizarEstudiantes()
    consultarCursos()
    descargarEvaluaciones()
    actualizarAsistencia()

    println("Todas las operaciones finalizadas.")
    println("Tiempo total: ${inicio.elapsedNow().inWholeMilliseconds} ms")
}
