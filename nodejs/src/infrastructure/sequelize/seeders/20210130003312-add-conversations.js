"use strict";

const conversationsMock = require("./__mock/conversations.json");

module.exports = {
  up: async (queryInterface, Sequelize) => {
    await queryInterface.bulkInsert(
      "conversations",
      conversationsMock.map((item) => ({
        id: item.id,
        createdAt: new Date(item.createdAt),
        updatedAt: new Date(item.updatedAt),
      })),
      {}
    );
  },

  down: async (queryInterface, Sequelize) => {
    /**
     * Add commands to revert seed here.
     *
     * Example:
     * await queryInterface.bulkDelete('People', null, {});
     */
    await queryInterface.bulkDelete("conversations", null, {});
  },
};
