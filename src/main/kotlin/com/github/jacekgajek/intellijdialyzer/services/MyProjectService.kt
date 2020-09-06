package com.github.jacekgajek.intellijdialyzer.services

import com.intellij.openapi.project.Project
import com.github.jacekgajek.intellijdialyzer.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
