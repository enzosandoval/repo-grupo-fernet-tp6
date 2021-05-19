/**
 * 
 */
package ar.edu.unju.fi.tp6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.tp6.entity.Compra;
import ar.edu.unju.fi.tp6.entity.Producto;
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
	private Producto producto;

	@Autowired
	private ICompraService compraService;

	@Autowired
	private IProductoService productoService;

	/**
	 * 
	 * @param id
	 * @param model
	 * @return Formulario de compra
	 */
	@GetMapping("/compra")
	public String getCompra(@RequestParam(value = "id", required = true) int id, Model model) {
		producto = productoService.buscarProducto(id);
		model.addAttribute("producto", producto);
		model.addAttribute("compra", compra);
		return "compra";
	}

	@GetMapping("/compras")
	public String getCompras(Model model) {
		model.addAttribute("compras", compraService.obtenerCompras());
		return "tablacompras";
	}

	@PostMapping("/compra/guardar")
	public ModelAndView saveCompra(@RequestParam(value = "id", required = true) int id,
			@ModelAttribute("compra") Compra compra) {
		ModelAndView mav = new ModelAndView("tablacompras");
		producto = productoService.buscarProducto(id);
		producto.setStock(producto.getStock() - compra.getCantidad());
		compra.setTotal(producto.getPrecio() * compra.getCantidad());
		compra.setProducto(producto);
		compraService.guardarCompra(compra);
		mav.addObject("compras", compraService.obtenerCompras());
		return mav;
	}

}
