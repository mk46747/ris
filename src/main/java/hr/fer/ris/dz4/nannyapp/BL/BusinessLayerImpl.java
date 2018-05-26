package hr.fer.ris.dz4.nannyapp.BL;

import hr.fer.ris.dz4.nannyapp.BL.model.Cooperation;
import hr.fer.ris.dz4.nannyapp.BL.model.Nanny;
import hr.fer.ris.dz4.nannyapp.BL.model.Offer;
import hr.fer.ris.dz4.nannyapp.BL.model.Review;
import hr.fer.ris.dz4.nannyapp.BL.model.User;
import hr.fer.ris.dz4.nannyapp.DAL.Dao;
import hr.fer.ris.dz4.nannyapp.DAL.model.CooperationDal;
import hr.fer.ris.dz4.nannyapp.DAL.model.NannyDal;
import hr.fer.ris.dz4.nannyapp.DAL.model.OfferDal;
import hr.fer.ris.dz4.nannyapp.DAL.model.ReviewDal;
import hr.fer.ris.dz4.nannyapp.DAL.model.UserDal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessLayerImpl implements BusinessLayer {

	@Autowired
	private Dao dao;

	@Override
	public Nanny getNanny(long id) {
		return getNanny(dao.getNanny(id));
	}

	@Override
	public List<Offer> getAllOffers(Nanny nanny) {
		List<OfferDal> offerDalList = dao.getAllOffers(dao.getNannyDal(nanny));
		return getOfferList(offerDalList);
	}

	@Override
	public Offer getOffer(long id) {
		return getOffer(dao.getOffer(id));
	}

	@Override
	public void createOffer(Offer offer) {
		dao.createOffer(dao.getOfferDal(offer));

	}

	@Override
	public void updateOffer(Offer offer) {
		dao.updateOffer(dao.getOfferDal(offer));

	}

	@Override
	public void updateNanny(Nanny nanny) {
		dao.updateNanny(dao.getNannyDal(nanny));

	}

	@Override
	public void deleteOffer(long id) {
		dao.deleteOffer(id);

	}

	@Override
	public Offer getOffer(OfferDal offerDal) {
		Offer offer = new Offer();
		if (offerDal == null) {
			return offer;
		}
		offer.setName(offerDal.getName());
		offer.setId(offerDal.getId());
		offer.setAddress(offerDal.getAddress());
		offer.setBabySittingPlace(offerDal.getBabySittingPlace());
		offer.setChildrenNumber(offerDal.getChldrenNumber());
		offer.setCity(offerDal.getCity());
		offer.setCooperation(getCooperation(offerDal.getCooperation()));
		offer.setDeadline(offerDal.getDeadline());
		offer.setEndTime(offerDal.getEndTime());
		offer.setExperience(offerDal.getExperience());
		offer.setMaxChildrenAge(offerDal.getMaxChildrenAge());
		offer.setMinChildrenAge(offerDal.getMinChildrenAge());
		offer.setNotice(offerDal.getNotice());
		offer.setOpened(offerDal.isOpened());
		// offer.setOwner(getUser(offerDal.getOwner()));
		offer.setPrice(offerDal.getPrice());
		offer.setStartTime(offerDal.getStartTime());
		return offer;
	}

	@Override
	public Nanny getNanny(NannyDal nannyDal) {
		Nanny nanny = new Nanny();
		if (nannyDal == null) {
			return nanny;
		}
		nanny.setId(nannyDal.getId());
		nanny.setAcceptedCooperations(getCooperationList(nannyDal
				.getAcceptedCooperations()));
		nanny.setCar(nannyDal.isCar());
		nanny.setContact(nannyDal.getContact());
		nanny.setEducation(nannyDal.getEducation());
		nanny.setExtraQualification(nannyDal.getExtraQualification());
		nanny.setExtraServices(nannyDal.getExtraServices());
		nanny.setGender(nannyDal.getGender());
		nanny.setInitiatedCooperations(getCooperationList(nannyDal
				.getInitiatedCooperations()));
		nanny.setName(nannyDal.getName());
		nanny.setOffers(getOfferList(nannyDal.getOffers()));
		nanny.setPassword(nannyDal.getPassword());
		nanny.setPets(nannyDal.isPets());
		nanny.setSickChildren(nannyDal.isSickChildren());
		nanny.setSmoking(nannyDal.isSmoking());
		nanny.setSurname(nannyDal.getSurname());
		nanny.setUsername(nannyDal.getUsername());
		nanny.setUserType(nannyDal.getUserType());
		return nanny;
	}

	@Override
	public Cooperation getCooperation(CooperationDal cooperationDal) {
		Cooperation cooperation = new Cooperation();
		if (cooperationDal == null) {
			return cooperation;
		}
		cooperation.setId(cooperationDal.getId());
		cooperation.setCooperationAceptee(getUser(cooperationDal
				.getCooperationAceptee()));
		cooperation.setCooperationInitiator(getUser(cooperationDal
				.getCooperationInitiator()));
		cooperation.setOffer(getOffer(cooperationDal.getOffer()));
		cooperation.setReview(getReview(cooperationDal.getReview()));
		cooperation.setStatus(cooperationDal.getStatus());
		return cooperation;
	}

	@Override
	public List<Offer> getOfferList(List<OfferDal> offerDalList) {
		List<Offer> offerList = new ArrayList<Offer>();
		if (offerDalList == null) {
			return offerList;
		}
		for (OfferDal oDal : offerDalList) {
			offerList.add(getOffer(oDal));
		}
		return offerList;
	}

	@Override
	public List<Cooperation> getCooperationList(
			List<CooperationDal> cooperationDalList) {
		List<Cooperation> cooperationList = new ArrayList<Cooperation>();
		if (cooperationDalList == null) {
			return cooperationList;
		}
		for (CooperationDal cDal : cooperationDalList) {
			cooperationList.add(getCooperation(cDal));
		}
		return cooperationList;
	}

	@Override
	public User getUser(UserDal userDal) {
		// TODO Parent!!
		return getNanny((NannyDal) userDal);
	}

	@Override
	public Review getReview(ReviewDal reviewDal) {
		Review review = new Review();
		if (reviewDal == null) {
			return review;
		}
		review.setId(review.getId());
		review.setCooperation(getCooperation(reviewDal.getCooperation()));
		review.setGrade(reviewDal.getGrade());
		review.setText(reviewDal.getText());
		return review;
	}

}
