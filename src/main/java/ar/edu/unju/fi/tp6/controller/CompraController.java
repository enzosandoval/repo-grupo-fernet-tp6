/**
 * 
 */
package ar.edu.unju.fi.tp6.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.tp6.entity.Cliente;
import ar.edu.unju.fi.tp6.entity.Compra;
import ar.edu.unju.fi.tp6.entity.Producto;
import ar.edu.unju.fi.tp6.service.IClienteService;
import ar.edu.unju.fi.tp6.service.ICompraService;
import ar.edu.unju.fi.tp6.service.IProductoService;

/**
 * @author Asus
 *
 */

@Controller
public class CompraController {

	@Autowired
	private Compra compra;

	@Autowired
	private Cliente cliente;

	@Autowired
	private ICompraService compraService;

	@Autowired
	private IClienteService clienteService;

	@Autowired
	private IProductoService productoService;

	@GetMapping("/compra")
	public String getCompra(Model model) throws Exception {
		model.addAttribute("productos", productoService.obtenerProductos());
		model.addAttribute("clientes", clienteService.obtenerClientes());
		model.addAttribute("compra", compra);
		return "compra";
	}
	

	@PostMapping("/compra/guardar")
	public ModelAndView saveCompra(@RequestParam(value = "id", required = true) int id,
			@ModelAttribute("compra") Compra compra) throws Exception {
		
		
		ModelAndView mav = new ModelAndView("tablacompras");
		mav.addObject("compras", compraService.obtenerCompras());
		return mav;
	}

	@GetMapping("/compras")
	public String getCompras(Model model) {
		model.addAttribute("compras", compraService.obtenerCompras());
		return "tablacompras";
	}

}
