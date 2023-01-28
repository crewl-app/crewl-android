package codeanalyzetools


/**
 * Precompiled [quality.gradle.kts][codeanalyzetools.Quality_gradle] script plugin.
 *
 * @see codeanalyzetools.Quality_gradle
 */
class QualityPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("codeanalyzetools.Quality_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
