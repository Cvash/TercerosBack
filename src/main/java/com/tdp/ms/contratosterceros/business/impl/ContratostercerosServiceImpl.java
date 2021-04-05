package com.tdp.ms.contratosterceros.business.impl;

import com.tdp.ms.contratosterceros.business.ContratostercerosService;
import com.tdp.ms.contratosterceros.model.ContratostercerosResponse;
import org.springframework.stereotype.Service;

/**
 * Class: ContratostercerosServiceImpl. <br/>
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
@Service
public class ContratostercerosServiceImpl implements ContratostercerosService {

    @Override
    public ContratostercerosResponse get() {
        return new ContratostercerosResponse("Hello world!");
    }

    @Override
    public ContratostercerosResponse put(String name) {
        return new ContratostercerosResponse(name + " created!");
    }

}
