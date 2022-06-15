package org.ikeda.store.location;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/store/v1/{storeId}/location")
public class StoreLocationController {

    @GetMapping
    public ResponseEntity<Void> getStoreLocation(@PathVariable("storeId") String storeId) {
        return ResponseEntity.ok().build();
    }
}
