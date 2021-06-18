package com.github.manuelmartos.testplugin071.services

import com.github.manuelmartos.testplugin071.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
