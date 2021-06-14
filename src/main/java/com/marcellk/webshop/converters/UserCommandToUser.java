package com.marcellk.webshop.converters;

import com.marcellk.webshop.commands.UserCommand;
import com.marcellk.webshop.models.User;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class UserCommandToUser implements Converter<UserCommand, User> {
    @Override
    public User convert(UserCommand userCommand) {
        if (userCommand == null) {
            return null;
        }
        return new User(userCommand.getName(), userCommand.getEmail(), userCommand.getPassword(), userCommand.getRang());
    }
}
