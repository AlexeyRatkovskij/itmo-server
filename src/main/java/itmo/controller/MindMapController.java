package itmo.controller;

import itmo.config.DataConfig;
import itmo.dto.MindMapDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MindMapController {
    private final DataConfig dataConfig;

    @GetMapping("/mind-map")
    public MindMapDto getMindMap() {
        return dataConfig.getTermLinks();
    }

    @PutMapping("/mind-map")
    public MindMapDto putMindMap(MindMapDto mindMapDto) {
        dataConfig.setTermLinks(mindMapDto);

        return dataConfig.getTermLinks();
    }
}
