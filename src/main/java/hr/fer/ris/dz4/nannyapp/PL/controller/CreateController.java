package hr.fer.ris.dz4.nannyapp.PL.controller;

import hr.fer.ris.dz4.nannyapp.BL.BusinessLayer;
import hr.fer.ris.dz4.nannyapp.BL.model.Nanny;
import hr.fer.ris.dz4.nannyapp.BL.model.Offer;
import hr.fer.ris.dz4.nannyapp.PL.Constants;
import hr.fer.ris.dz4.nannyapp.PL.forms.OfferForm;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/create")
public class CreateController {

	@Autowired
	private BusinessLayer businessLayer;

	@RequestMapping(method = RequestMethod.GET)
	public String render(HttpServletRequest request, ModelMap model) {
		Nanny nanny = businessLayer.getNanny(1);
		List<Offer> offers = nanny.getOffers();

		System.out.println("#####-Create");
		String wasError = request.getParameter("wasError");
		OfferForm offerForm = null;
		if (!StringUtils.isEmpty(wasError) && wasError.equalsIgnoreCase("true")) {
			offerForm = (OfferForm) model
					.get(Constants.MODEL_ATTRIBUTE_NAME_OFFER_FORM);
		} else {
			offerForm = new OfferForm();
		}

		model.addAttribute(Constants.MODEL_ATTRIBUTE_NAME_OFFER_FORM, offerForm);

		model.addAttribute(Constants.MODEL_ATTRIBUTE_NAME_OFFERS, offers);

		model.addAttribute(Constants.MODEL_ATTRIBUTE_NAME_NANNY, nanny);

		return "create";

	}

	@RequestMapping(method = RequestMethod.POST)
	public String save(
			HttpServletRequest request,
			@ModelAttribute(Constants.MODEL_ATTRIBUTE_NAME_OFFER_FORM) OfferForm offerForm,
			ModelMap model) {
		System.out.println("SAve -");
		System.out.println(offerForm);
		System.out.println("--" + offerForm == null ? "null" : offerForm
				.getName());

		// TODO validate
		Offer offer = getOfferFromForm(offerForm);

		// TODO dodati u nanny
		businessLayer.createOffer(offer);
		// Nanny nanny = businessLayer.getNanny(1);
		// nanny.getOffers().add(offer);
		// businessLayer.updateNanny(nanny);

		return "redirect:/view";

	}

	private Offer getOfferFromForm(OfferForm offerForm) {
		Offer offer = new Offer();
		if (offerForm == null) {
			return offer;
		}
		offer.setName(offerForm.getName());
		offer.setAddress(offerForm.getAddress());
		// offer.setBabySittingPlace(offerForm.getBabySittingPlace());
		// offer.setChildrenNumber(offerForm.getChildrenNumber());
		offer.setCity(offerForm.getCity());
		// offer.setDeadline(offerForm.getDeadline());
		// offer.setEndTime(offerForm.getEndTime());
		offer.setExperience(offerForm.getExperience());
		// offer.setMaxChildrenAge(offerForm.getMaxChildrenAge());
		// offer.setMinChildrenAge(offerForm.getMinChildrenAge());
		offer.setNotice(offerForm.getNotice());
		// offer.setOpened(offerForm.isOpened());
		// offer.setOwner(getUser(offerForm.getOwner()));
		offer.setPrice(Double.parseDouble(offerForm.getPrice()));
		offer.setStartTime(new DateTime());
		return offer;
	}

}
