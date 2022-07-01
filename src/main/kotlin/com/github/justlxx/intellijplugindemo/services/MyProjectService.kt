package com.github.justlxx.intellijplugindemo.services

import com.intellij.openapi.project.Project
import com.github.justlxx.intellijplugindemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
