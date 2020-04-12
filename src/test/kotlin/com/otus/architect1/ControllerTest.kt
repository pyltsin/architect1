package com.otus.architect1

import com.otus.architect1.Controller.Response
import io.github.udaychandra.bdd.ext.Scenario
import io.github.udaychandra.bdd.ext.Scene
import io.github.udaychandra.bdd.ext.Story
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
@Story(name = "Рассказ о контроллере")
internal class ControllerTest {

    @Autowired
    lateinit var controller: Controller

    @Scenario("проверка его здоровья")
    fun healthCheck(scene: Scene) {
        scene.`when`("Вызов") {
            val health: Response = controller.healthCheck()
            scene.put("health", health)
        }.then("проверка") {
            assertEquals("OK", (scene.get("health") as Response).status)
        }
    }
}