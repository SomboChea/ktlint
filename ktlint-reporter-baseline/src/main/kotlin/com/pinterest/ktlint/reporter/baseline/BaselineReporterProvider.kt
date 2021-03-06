package com.pinterest.ktlint.reporter.baseline

import com.pinterest.ktlint.core.Reporter
import com.pinterest.ktlint.core.ReporterProvider
import java.io.PrintStream

class BaselineReporterProvider : ReporterProvider {
    override val id: String = "baseline"
    override fun get(out: PrintStream, opt: Map<String, String>): Reporter = BaselineReporter(out)
}
