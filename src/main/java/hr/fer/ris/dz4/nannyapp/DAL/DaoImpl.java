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

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("dao")
@Transactional
public class DaoImpl extends AbstractDaoImpl implements Dao {

	@Override
	public NannyDal getNanny(long id) {
		return getByProperty(id, NannyDal.class, "id");

	}

	@Override
	public List<OfferDal> getAllOffers(NannyDal nanny) {
		return getAllByProperty(nanny.getId(), OfferDal.class, "owner_id");
	}

	@Override
	public OfferDal getOffer(long id) {
		return getByProperty(id, OfferDal.class, "id");
	}

	@Override
	public void createOffer(OfferDal offer) {
		create(offer);

	}

	@Override
	public void updateOffer(OfferDal offer) {
		update(offer);

	}

	@Override
	public void updateNanny(NannyDal nanny) {
		update(nanny);

	}

	@Override
	public void deleteOffer(long id) {
		OfferDal offer = getOffer(id);
		delete(offer);

	}

	@Override
	public OfferDal getOfferDal(Offer offer) {
		OfferDal offerDal = new OfferDal();
		if (offer == null) {
			return offerDal;
		}
		offerDal.setName(offer.getName());
		offerDal.setId(offer.getId());
		offerDal.setAddress(offer.getAddress());
		offerDal.setBabySittingPlace(offer.getBabySittingPlace());
		offerDal.setChldrenNumber(offer.getChildrenNumber());
		offerDal.setCity(offer.getCity());
		offerDal.setCooperation(getCooperationDal(offer.getCooperation()));
		offerDal.setDeadline(offer.getDeadline());
		offerDal.setEndTime(offer.getEndTime());
		offerDal.setExperience(offer.getExperience());
		offerDal.setMaxChildrenAge(offer.getMaxChildrenAge());
		offerDal.setMinChildrenAge(offer.getMinChildrenAge());
		offerDal.setNotice(offer.getNotice());
		offerDal.setOpened(offer.isOpened());
		offerDal.setOwner(getUserDal(offer.getOwner()));
		offerDal.setPrice(offer.getPrice());
		offerDal.setStartTime(offer.getStartTime());
		return offerDal;
	}

	@Override
	public NannyDal getNannyDal(Nanny nanny) {
		NannyDal nannyDal = new NannyDal();
		if (nanny == null) {
			return nannyDal;
		}
		nannyDal.setId(nanny.getId());
		nannyDal.setAcceptedCooperations(getCooperationDalList(nanny
				.getAcceptedCooperations()));
		nannyDal.setCar(nanny.isCar());
		nannyDal.setContact(nanny.getContact());
		nannyDal.setEducation(nanny.getEducation());
		nannyDal.setExtraQualification(nanny.getExtraQualification());
		nannyDal.setExtraServices(nanny.getExtraServices());
		nannyDal.setGender(nanny.getGender());
		nannyDal.setInitiatedCooperations(getCooperationDalList(nanny
				.getInitiatedCooperations()));
		nannyDal.setName(nanny.getName());
		nannyDal.setOffers(getOfferDalList(nanny.getOffers()));
		nannyDal.setPassword(nanny.getPassword());
		nannyDal.setPets(nanny.isPets());
		nannyDal.setSickChildren(nanny.isSickChildren());
		nannyDal.setSmoking(nanny.isSmoking());
		nannyDal.setSurname(nanny.getSurname());
		nannyDal.setUsername(nanny.getUsername());
		nannyDal.setUserType(nanny.getUserType());
		return nannyDal;
	}

	@Override
	public CooperationDal getCooperationDal(Cooperation cooperation) {
		CooperationDal cooperationDal = new CooperationDal();
		if (cooperation == null) {
			return cooperationDal;
		}
		cooperationDal.setId(cooperation.getId());
		cooperationDal.setCooperationAceptee(getUserDal(cooperation
				.getCooperationAceptee()));
		cooperationDal.setCooperationInitiator(getUserDal(cooperation
				.getCooperationInitiator()));
		cooperationDal.setOffer(getOfferDal(cooperation.getOffer()));
		cooperationDal.setReview(getReviewDal(cooperation.getReview()));
		cooperationDal.setStatus(cooperation.getStatus());
		return cooperationDal;
	}

	@Override
	public List<OfferDal> getOfferDalList(List<Offer> offerList) {
		List<OfferDal> offerDalList = new ArrayList<OfferDal>();
		if (offerList == null) {
			return offerDalList;
		}
		for (Offer o : offerList) {
			offerDalList.add(getOfferDal(o));
		}
		return offerDalList;
	}

	@Override
	public List<CooperationDal> getCooperationDalList(
			List<Cooperation> cooperationList) {
		List<CooperationDal> cooperationDalList = new ArrayList<CooperationDal>();
		if (cooperationList == null) {
			return cooperationDalList;
		}
		for (Cooperation c : cooperationList) {
			cooperationDalList.add(getCooperationDal(c));
		}
		return cooperationDalList;
	}

	@Override
	public ReviewDal getReviewDal(Review review) {
		ReviewDal reviewDal = new ReviewDal();
		if (review == null) {
			return reviewDal;
		}
		reviewDal.setId(review.getId());
		reviewDal.setCooperation(getCooperationDal(review.getCooperation()));
		reviewDal.setGrade(review.getGrade());
		reviewDal.setText(review.getText());
		return reviewDal;
	}

	@Override
	public UserDal getUserDal(User user) {
		// TODO parent
		// if(user.getUserType() == UserType.NANNY){
		// return getNannyDal((Nanny)user);
		// }else{
		//
		// }
		return getNannyDal((Nanny) user);
	}

}
