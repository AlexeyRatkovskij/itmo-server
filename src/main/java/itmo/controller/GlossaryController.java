package itmo.controller;

import itmo.config.DataConfig;
import itmo.dto.GlossaryDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GlossaryController {
    private final DataConfig dataConfig;

    @GetMapping("/glossary")
    public GlossaryDto getGlossary() {
        return dataConfig.getTerms();
    }

    @PutMapping("/glossary")
    public GlossaryDto putGlossary(GlossaryDto glossaryDto) {
        dataConfig.setTerms(glossaryDto);

        return dataConfig.getTerms();
    }
}
