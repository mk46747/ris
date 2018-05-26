package hr.fer.ris.dz4.nannyapp.BL;

import hr.fer.ris.dz4.nannyapp.BL.model.Cooperation;
import hr.fer.ris.dz4.nannyapp.BL.model.Nanny;
import hr.fer.ris.dz4.nannyapp.BL.model.Offer;
import hr.fer.ris.dz4.nannyapp.BL.model.Review;
import hr.fer.ris.dz4.nannyapp.BL.model.User;
import hr.fer.ris.dz4.nannyapp.DAL.model.CooperationDal;
import hr.fer.ris.dz4.nannyapp.DAL.model.NannyDal;
import hr.fer.ris.dz4.nannyapp.DAL.model.OfferDal;
import hr.fer.ris.dz4.nannyapp.DAL.model.ReviewDal;
import hr.fer.ris.dz4.nannyapp.DAL.model.UserDal;

import java.util.List;

public interface BusinessLayer {
	Nanny getNanny(long id);

	List<Offer> getAllOffers(Nanny nanny);

	Offer getOffer(long id);

	void createOffer(Offer offer);

	void updateOffer(Offer offer);

	void updateNanny(Nanny nanny);

	void deleteOffer(long id);

	Offer getOffer(OfferDal offerDal);

	Nanny getNanny(NannyDal nannyDal);

	Cooperation getCooperation(CooperationDal cooperationDal);

	List<Offer> getOfferList(List<OfferDal> offerDalList);

	List<Cooperation> getCooperationList(List<CooperationDal> offerDalList);

	User getUser(UserDal userDal);

	Review getReview(ReviewDal reviewDal);
}
