package com.marcellk.webshop.converters;

import com.marcellk.webshop.commands.UserCommand;
import com.marcellk.webshop.models.User;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class UserToUserCommand implements Converter<User, UserCommand> {
    @Override
    public UserCommand convert(User user) {
        if (user == null) {
            return null;
        }
        UserCommand userCommand = new UserCommand();
        userCommand.setName(user.getName());
        userCommand.setEmail(user.getEmail());
        userCommand.setPassword(user.getPassword());
        userCommand.setRang(user.getRang());
        return userCommand;
    }
}
