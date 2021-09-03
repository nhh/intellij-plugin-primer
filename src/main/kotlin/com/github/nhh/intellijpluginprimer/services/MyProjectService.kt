package com.github.nhh.intellijpluginprimer.services

import com.github.nhh.intellijpluginprimer.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
