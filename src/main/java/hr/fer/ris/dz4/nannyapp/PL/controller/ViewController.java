package hr.fer.ris.dz4.nannyapp.PL.controller;

import hr.fer.ris.dz4.nannyapp.BL.BusinessLayer;
import hr.fer.ris.dz4.nannyapp.BL.model.Nanny;
import hr.fer.ris.dz4.nannyapp.BL.model.Offer;
import hr.fer.ris.dz4.nannyapp.PL.Constants;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/view")
public class ViewController {

	@Autowired
	private BusinessLayer businessLayer;

	@RequestMapping(method = RequestMethod.GET)
	public String render(HttpServletRequest request, ModelMap model) {
		System.out.println("###############################################");

		Nanny nanny = businessLayer.getNanny(1);
		System.out.println("-------" + nanny.getName());

		String offerIdString = request
				.getParameter(Constants.REQUEST_PARAM_NAME_OFFER_ID);
		System.out.println("Req param offerId= " + offerIdString);

		List<Offer> offers = nanny.getOffers();
		System.out.println("-------" + offers);

		if (offers != null && !offers.isEmpty()) {
			System.out.println(offers.get(0).getAddress());
		}
		Offer offerToDisplay = null;
		Long offerId = null;

		try {
			offerId = Long.parseLong(offerIdString);
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatEx, value: " + offerIdString);
		}

		if (offerId == null) {
			offerToDisplay = offers.get(0);
			System.out.println("offerID = null, displaying default offer");
		} else {
			offerToDisplay = businessLayer.getOffer(offerId);
			System.out.println("offerID = " + offerId + ", displaying offer "
					+ offerToDisplay.getAddress());

		}

		model.addAttribute(Constants.MODEL_ATTRIBUTE_NAME_OFFERS, offers);
		model.addAttribute(Constants.MODEL_ATTRIBUTE_NAME_OFFER_TO_DISPLAY,
				offerToDisplay);
		model.addAttribute(Constants.MODEL_ATTRIBUTE_NAME_NANNY, nanny);

		return "view";

	}

}
