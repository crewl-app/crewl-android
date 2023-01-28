package codeanalyzetools


/**
 * Precompiled [version-check.gradle.kts][codeanalyzetools.Version_check_gradle] script plugin.
 *
 * @see codeanalyzetools.Version_check_gradle
 */
class VersionCheckPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("codeanalyzetools.Version_check_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
