package hr.fer.ris.dz4.nannyapp.DAL;

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

public interface Dao {

	NannyDal getNanny(long id);

	List<OfferDal> getAllOffers(NannyDal nanny);

	OfferDal getOffer(long id);

	void createOffer(OfferDal offer);

	void updateOffer(OfferDal offer);

	void updateNanny(NannyDal nanny);

	void deleteOffer(long id);

	OfferDal getOfferDal(Offer offer);

	NannyDal getNannyDal(Nanny nanny);

	CooperationDal getCooperationDal(Cooperation cooperation);

	List<OfferDal> getOfferDalList(List<Offer> offerList);

	List<CooperationDal> getCooperationDalList(List<Cooperation> offerList);

	UserDal getUserDal(User user);

	ReviewDal getReviewDal(Review review);
}