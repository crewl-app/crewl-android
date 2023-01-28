package codeanalyzetools


/**
 * Precompiled [ktlint-check.gradle.kts][codeanalyzetools.Ktlint_check_gradle] script plugin.
 *
 * @see codeanalyzetools.Ktlint_check_gradle
 */
class KtlintCheckPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("codeanalyzetools.Ktlint_check_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
