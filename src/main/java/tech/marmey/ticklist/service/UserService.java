package tech.marmey.ticklist.service;

import org.springframework.web.multipart.MultipartFile;
import tech.marmey.ticklist.domain.User;
import tech.marmey.ticklist.exception.domain.EmailExistException;
import tech.marmey.ticklist.exception.domain.EmailNotFoundException;
import tech.marmey.ticklist.exception.domain.UserNotFoundException;
import tech.marmey.ticklist.exception.domain.UsernameExistException;

import javax.mail.MessagingException;
import java.io.IOException;
import java.util.List;

public interface UserService {

    User register(String firstName, String lastName, String username, String email) throws UserNotFoundException, EmailExistException, UsernameExistException, MessagingException;

    List<User> getUsers();

    User findUserByUsername(String username);

    User findUserByEmail(String email);

    User addNewUser(String firstName, String lastName, String username, String email, String role, boolean isNonLocked, boolean isActive, MultipartFile profileImage) throws EmailExistException, UsernameExistException, IOException;
    User updateUser(String currentUsername, String newFirstName, String newLastName, String newUsername, String newEmail, String role, boolean isActive, boolean isNonLocked, MultipartFile profileImage) throws EmailExistException, UsernameExistException, IOException;
    void deleteUser(Long id);
    void resetPassword(String email) throws EmailNotFoundException, MessagingException;
    User updateProfileImage(String username, MultipartFile profileImage) throws EmailExistException, UsernameExistException, IOException;
}
