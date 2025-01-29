package fr.efrei.rag.web.rest;

import fr.efrei.rag.service.AIAssistantService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AIAssistantResource {
    private final Logger log = LoggerFactory.getLogger(AIAssistantResource.class);
    private final AIAssistantService aiAssistantService;

    AIAssistantResource(AIAssistantService aiAssistantService) {
        this.aiAssistantService = aiAssistantService;
    }

    @PostMapping("/assistant/chat")
    public String chat(@RequestBody String query) {
        log.debug("REST request to chat with AI Assistant : {}", query);
        return aiAssistantService.chat(query);
    }

}
