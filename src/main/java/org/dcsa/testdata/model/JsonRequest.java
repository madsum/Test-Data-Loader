package org.dcsa.testdata.model;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class JsonRequest {
    private String uploadType;
    private MultipartFile file;
}
