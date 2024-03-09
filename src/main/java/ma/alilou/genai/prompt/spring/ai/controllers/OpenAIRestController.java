package ma.alilou.genai.prompt.spring.ai.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OpenAIRestController {

    private final ChatClient chatClient;

    @GetMapping("/chat/{message}")
    public String chat(@PathVariable String message){
    return chatClient.call(message);
    }
}
