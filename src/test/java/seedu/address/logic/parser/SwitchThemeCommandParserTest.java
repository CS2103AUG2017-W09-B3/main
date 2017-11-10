package seedu.address.logic.parser;

import org.junit.Test;
import seedu.address.logic.commands.SwitchThemeCommand;

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseFailure;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseSuccess;

public class SwitchThemeCommandParserTest {
    private SwitchThemeCommandParser parser = new SwitchThemeCommandParser();

    @Test
    public void parseValidArgsReturnsSwitchThemeCommand() {
        String themeChoice1 = "1";
        String themeChoice2 = "dark";
        String themeChoice3 = "Twilight";
        SwitchThemeCommand expectedSwitchThemeCommandOne =
                new SwitchThemeCommand(themeChoice1);
        assertParseSuccess(parser, themeChoice1, expectedSwitchThemeCommandOne);

        SwitchThemeCommand expectedSwitchThemeCommandTwo =
                new SwitchThemeCommand(themeChoice2);
        assertParseSuccess(parser, themeChoice2, expectedSwitchThemeCommandTwo);

        SwitchThemeCommand expectedSwitchThemeCommandThree =
                new SwitchThemeCommand(themeChoice3);
        assertParseSuccess(parser, themeChoice3, expectedSwitchThemeCommandThree);
    }

    @Test
    public void parseEmptyArgThrowsParseException() {
        assertParseFailure(parser, "     ",
                String.format(MESSAGE_INVALID_COMMAND_FORMAT, SwitchThemeCommand.MESSAGE_USAGE));
    }
}
