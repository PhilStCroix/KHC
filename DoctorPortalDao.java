

import java.util.List;

public class DoctorPortalDao {
    private UserDao userDao;
    private HealthDataDao healthDataDao;

   // Complete all these methods and add more as needed

   public DoctorPortalDao() {
        userDao = new UserDao();
        healthDataDao = new HealthDataDao();
    }

    public Doctor getDoctorById(int doctorId) {
        return userDao.getDoctorById(doctorId);
    }

    public List<User> getPatientsByDoctorId(int doctorId) {
        return userDao.getPatientsByDoctorId(doctorId);
    }

    public List<HealthData> getHealthDataByPatientId(int patientId) {
        return healthDataDao.getHealthDataByPatientId(patientId);
    }

    // Add more methods for other doctor-specific tasks

}

