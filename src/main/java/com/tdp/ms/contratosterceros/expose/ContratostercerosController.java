package com.tdp.ms.contratosterceros.expose;

import com.tdp.ms.contratosterceros.business.ContratostercerosService;
import com.tdp.ms.contratosterceros.model.ContratostercerosRequest;
import com.tdp.ms.contratosterceros.model.ContratostercerosResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * Class: ContratostercerosController. <br/>
 * <b>Copyright</b>: &copy; 2019 Telef&oacute;nica del Per&uacute;<br/>
 * <b>Company</b>: Telef&oacute;nica del Per&uacute;<br/>
 *
 * @author Telef&oacute;nica del Per&uacute; (TDP) <br/>
 *         <u>Service Provider</u>: Everis Per&uacute; SAC (EVE) <br/>
 *         <u>Developed by</u>: <br/>
 *         <ul>
 *         <li>Developer name</li>
 *         </ul>
 *         <u>Changes</u>:<br/>
 *         <ul>
 *         <li>YYYY-MM-DD Creaci&oacute;n del proyecto.</li>
 *         </ul>
 * @version 1.0
 */
@RestController
@RequestMapping("/contratosterceros/v1/greeting")
public class ContratostercerosController {

    @Autowired
    private ContratostercerosService contratostercerosService;

    @GetMapping
    public Mono<ContratostercerosResponse> indexGet() {
        return Mono.justOrEmpty(this.contratostercerosService.get());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<ContratostercerosResponse> indexPost(@RequestBody ContratostercerosRequest request) {
        return Mono.justOrEmpty(this.contratostercerosService.put(request.getName()));
    }

}
