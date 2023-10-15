package com.example.blog

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status


@SpringBootTest
@AutoConfigureMockMvc
class ActuatorTests(@Autowired val mockMvc: MockMvc) {

  @Test
  fun `Actuator health check test`() {
    mockMvc.perform(get("/_health"))
      .andExpect(status().isOk)
  }
}