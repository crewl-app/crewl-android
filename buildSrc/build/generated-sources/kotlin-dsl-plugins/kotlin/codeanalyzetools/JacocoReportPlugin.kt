package codeanalyzetools


/**
 * Precompiled [jacoco-report.gradle.kts][codeanalyzetools.Jacoco_report_gradle] script plugin.
 *
 * @see codeanalyzetools.Jacoco_report_gradle
 */
class JacocoReportPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("codeanalyzetools.Jacoco_report_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
