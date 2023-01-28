package codeanalyzetools


/**
 * Precompiled [detekt-check.gradle.kts][codeanalyzetools.Detekt_check_gradle] script plugin.
 *
 * @see codeanalyzetools.Detekt_check_gradle
 */
class DetektCheckPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("codeanalyzetools.Detekt_check_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
